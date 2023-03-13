//
//  simpleLoginIOSApp.swift
//  simpleLoginIOS
//
//  Created by Jacee Dai on 2023/3/10.
//

import SwiftUI
import shared

@main
struct simpleLoginIOSApp: App {
    var body: some Scene {
        WindowGroup {
        
            ContentView(viewModel: .init(loginRepository: LoginRepository(dataSource: LoginDataSource()), loginValidator: LoginDataValidator()))
        }
    }
}
