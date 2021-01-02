package com.SwiftUI_Tutorials;

import com.DroidUIJson;

public class A01a_ContentView implements View {
    var body: some View {
        Text("Hello World")
    }
}

public class A01a_ContentView_Previews implements PreviewProvider {
    static var previews: some View {
        JsonPreview {
            A01a_ContentView()
        }
    }
}
