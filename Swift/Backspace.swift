//
//  Backspace.swift
//  Project
//
//  Created by Abu Nabe on 15/10/21.
//

import UIKit

extension String {
  var isBackspace: Bool {
    let char = self.cString(using: String.Encoding.utf8)!
    return strcmp(char, "\\b") == -92
  }
}

