//
//  CacheManager.swift
//  Project
//
//  Created by Abu Nabe on 5/1/2023.
//

import Foundation

public enum CacheResult<T> {
    case success(T)
    case failure(NSError)
}

class CachedVideos {

    static let shared = CachedVideos()
    private let fileManager = FileManager.default
    private lazy var mainDirectoryUrl: URL = {

    let documentsUrl = self.fileManager.urls(for: .cachesDirectory, in: .userDomainMask).first!
        return documentsUrl
    }()

    func getFileWith(stringUrl: String, completionHandler: @escaping (CacheResult<URL>) -> Void ) {

        let file = directoryFor(stringUrl: stringUrl)

        //return file path if already exists in cache directory
        guard !fileManager.fileExists(atPath: file.path)  else {
            completionHandler(CacheResult.success(file))
            return
        }
        
        DispatchQueue.main.async {
            let error = NSError(domain: "SomeErrorDomain", code: -2001 /* some error code */, userInfo: ["description": "Can't download video"])

            completionHandler(CacheResult.failure(error))
        }
    }

    private func directoryFor(stringUrl: String) -> URL {

        let fileURL = URL(string: stringUrl)!.lastPathComponent
        let file = self.mainDirectoryUrl.appendingPathComponent(fileURL)
        return file
    }
}
