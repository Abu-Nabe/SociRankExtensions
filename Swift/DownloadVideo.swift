//
//  DownloadVideo.swift
//  Project
//
//  Created by Abu Nabe on 10/10/2022.
//

import UIKit
import Photos

class DownloadVideo
{
    public static func downloadFromUrl(videoUrl: String, path: String)
    {
        if let url = URL(string: videoUrl),
                let urlData = NSData(contentsOf: url) {
                let documentsPath = NSSearchPathForDirectoriesInDomains(.documentDirectory, .userDomainMask, true)[0];
                let filePath = (documentsPath) + "/" + path
                DispatchQueue.main.async {
                    urlData.write(toFile: filePath, atomically: true)
                    PHPhotoLibrary.shared().performChanges({
                        PHAssetChangeRequest.creationRequestForAssetFromVideo(atFileURL: URL(fileURLWithPath: filePath))
                    }) { completed, error in
                        if completed {
                           
                        }
                    }
                }
            }
    }
}

