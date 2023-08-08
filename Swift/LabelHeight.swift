//
//  LabelHeight.swift
//  Project
//
//  Created by Abu Nabe on 17/10/21.
//

import UIKit

extension UIViewController{

func estimatedHeightOfLabel(text: String) -> CGFloat {

    let size = CGSize(width: view.frame.width - 16, height: 1000)

    let options = NSStringDrawingOptions.usesFontLeading.union(.usesLineFragmentOrigin)

    let attributes = [NSAttributedString.Key.font: UIFont.systemFont(ofSize: 10)]

    let rectangleHeight = String(text).boundingRect(with: size, options: options, attributes: attributes, context: nil).height

    return rectangleHeight
    }
}
