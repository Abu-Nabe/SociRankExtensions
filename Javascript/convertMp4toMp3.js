import { createWorker } from 'ffmpeg.js/ffmpeg-mp4.js';

export const convertVideoToAudio = async (videoFile) => {
  // Initialize ffmpeg
  const ffmpegInstance = createWorker();
  
  // Load video file
  await ffmpegInstance.load();
  ffmpegInstance.FS('writeFile', 'input.mp4', new Uint8Array(await videoFile.arrayBuffer()));
  
  // Run ffmpeg command to convert video to audio
  await ffmpegInstance.run('-i', 'input.mp4', 'output.mp3');
  
  // Retrieve converted audio
  const audioData = ffmpegInstance.FS('readFile', 'output.mp3');
  const audioBlob = new Blob([audioData.buffer], { type: 'audio/mp3' });
  const audioUrl = URL.createObjectURL(audioBlob);

  console.log("Conversion complete. Audio URL:", audioUrl);
  
  // Clean up
  ffmpegInstance.FS('unlink', 'input.mp4');
  ffmpegInstance.FS('unlink', 'output.mp3');
  ffmpegInstance.terminate();

  return audioUrl;
};
