//
//  backSwipe.swift
//  Project
//
//  Created by Abu Nabe on 19/1/2023.
//

import UIKit

extension UINavigationController: UIGestureRecognizerDelegate{
    public func gestureRecognizerShouldBegin(_ gestureRecognizer: UIGestureRecognizer) -> Bool {
        if gestureRecognizer.isEqual(navigationController?.interactivePopGestureRecognizer) {
            navigationController?.popViewController(animated: true)
        }
        return false
    }
}
