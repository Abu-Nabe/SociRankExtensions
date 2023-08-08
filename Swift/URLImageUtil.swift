//
//  URLImageUtil.swift
//  Project
//
//  Created by Abu Nabe on 24/1/22.
//
import UIKit

class URLImageUtil {
    static func loadImageFromCacheWithUrlString(urlString: String, completion: @escaping (_ url: URL,_ image: UIImage)->Void) {
        if let url = URL(string: urlString) {
            URLSession.shared.dataTask(
                with: url, completionHandler: {data,response,error in
                    if (data) != nil {
                        if let image = UIImage.init(data: data!) {
                            completion(url, image)
                        } else {
                            print("data not image from url: \(url)")
                        }
                    } else {
                        print("no data from url: \(url)")
                    }
            })
        } else {
            print("error url: \(urlString)")
        }
    }
}
