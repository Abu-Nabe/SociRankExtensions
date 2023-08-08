//
//  TextViewSize.swift
//  Project
//
//  Created by Abu Nabe on 24/6/2022.
//

import UIKit

class TextViewSize{
    public static func estimateFrameforText(text: String) -> CGRect {
        let size = CGSize(width: 1000, height: 1000)
        let options = NSStringDrawingOptions.usesFontLeading.union(.usesLineFragmentOrigin)
        
        return NSString(string: text).boundingRect(with: size, options: options, attributes: [NSAttributedString.Key.font: UIFont.systemFont(ofSize: 16)], context: nil)
    }
}
