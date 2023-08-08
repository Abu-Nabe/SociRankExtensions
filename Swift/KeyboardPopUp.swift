//
//  KeyboardPopUp.swift
//  Project
//
//  Created by Abu Nabe on 10/8/21.
//

import UIKit

class KeyboardPopup: UIViewController
{
    @objc func dismissKeyboard (_ sender: UITapGestureRecognizer, field: UITextField) {
        field.resignFirstResponder()
//        NotificationCenter.default.removeObserver(self, name: NSNotification.Name(rawValue: NSNotification.Name.RawValue(_sel: Selector("keyboardWillAppear:"))), object: self.view.window)
//        NotificationCenter.default.removeObserver(self, name: UIResponder.keyboardWillHideNotification, object: self.view.window)
    }

    @objc func keyboardWillShow(sender: NSNotification) {
        if let keyboardSize = (sender.userInfo?[UIResponder.keyboardFrameEndUserInfoKey] as? NSValue)?.cgRectValue {
            self.view.frame.origin.y = -keyboardSize.height
      }
    }

    @objc func keyboardWillHide(sender: NSNotification) {
        self.view.frame.origin.y = 0
    }

}
