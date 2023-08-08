//
//  galleryVidDuration.swift
//  Project
//
//  Created by Abu Nabe on 13/8/2022.
//

import UIKit
import AVKit

class galleryVidDuration{
    public static func getVideoDuration(from path: URL) -> String {
        let asset = AVURLAsset(url: path)
        let duration: CMTime = asset.duration
      
        let totalSeconds = CMTimeGetSeconds(duration)
        let hours = Int(totalSeconds / 3600)
        let minutes = Int((totalSeconds.truncatingRemainder(dividingBy: 3600)) / 60)
        let seconds = Int(totalSeconds.truncatingRemainder(dividingBy: 60))

        if minutes > 2 {
            return String(format: "%02i:%02i", minutes, seconds)
        }else if hours > 0 {
            return String(format: "%i:%02i:%02i", hours, minutes, seconds)
        } else {
            return String(format: "%02i:%02i", minutes, seconds)
        }
    }
}
