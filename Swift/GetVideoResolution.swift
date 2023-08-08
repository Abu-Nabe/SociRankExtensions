//
//  GetVideoResolution.swift
//  Project
//
//  Created by Abu Nabe on 16/9/2022.
//

import UIKit
import AVKit

class GetVideoResolution{
    static func resolutionSizeForLocalVideo(url:URL) -> CGSize? {
        guard let track = AVAsset(url: url as URL).tracks(withMediaType: AVMediaType.video).first else { return nil }
        let size = track.naturalSize.applying(track.preferredTransform)
        return CGSize(width: abs(size.width), height: abs(size.height))
    }
}
