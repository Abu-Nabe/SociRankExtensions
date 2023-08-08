//
//  DurationToSeconds.swift
//  Project
//
//  Created by Abu Nabe on 25/9/2022.
//

import UIKit

class DurationToSeconds{
    public static func stringFromTimeInterval(interval: Double) -> NSString {
        
        let hours = (Int(interval) / 3600)
        let minutes = Int(interval / 60) - Int(hours * 60)
        let seconds = Int(interval) - (Int(interval / 60) * 60)
        
        if(hours > 0){
            return NSString(format: "%0.2d:%0.2d:%0.2d",hours,minutes,seconds)
        }else {
            return NSString(format: "%0.2d:%0.2d",minutes,seconds)
        }
    }
}
