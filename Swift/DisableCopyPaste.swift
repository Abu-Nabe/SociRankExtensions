//
//  DisableCopyPaste.swift
//  Project
//
//  Created by Abu Nabe on 24/8/2022.
//

import UIKit

class DisableCopyPaste: UITextField {

    override func canPerformAction(_ action: Selector, withSender sender: Any?) -> Bool {
            if action == #selector(UIResponderStandardEditActions.paste(_:)) {
                return false
            }
            return super.canPerformAction(action, withSender: sender)
       }
}
