//
//  VerificationLabel.swift
//  Project
//
//  Created by Abu Nabe on 16/3/22.
//

import UIKit

extension UILabel {
  func setVerification(image: UIImage, with text: String) {
    let attachment = NSTextAttachment()
    attachment.image = image
    attachment.bounds = CGRect(x: 1, y: -2.5, width: 17, height: 17)

    let attachmentString = NSAttributedString(attachment: attachment)
    let string = NSMutableAttributedString(string: text, attributes: [:])

    string.append(attachmentString)
    self.attributedText = string
  }
}
