# Kotlin_ToDo
## 手順書
1. Android Studio から New Project を選択
2. Empty Activity を選択して Next
3. Language に Kotlin を選択して Finish
4. 必要なライブラリを build.gradle に記述
  - ViewModel
  - Room
  - LiveData
  - DataBinding
```
dependencies {
    // ViewModelとLiveDataの両方を使用する場合
    implementation 'androidx.lifecycle:lifecycle-extensions:2.2.0-rc03'
    kapt 'androidx.lifecycle:lifecycle-compiler:2.2.0-rc03'

    // Room
    implementation 'androidx.room:room-runtime:2.2.2'
    kapt 'androidx.room:room-compiler:2.2.2'
    // Roomでコルーチンを使用する場合に追加
    implementation 'androidx.room:room-ktx:2.2.2'
}
```

## 注意点
Kotlinのアノテーションプロセッサをbuild.gradleに書く場合、annotationProcessor ではなく kapt で指定する
kaptを使用する場合、app/build.gradle に `kotlin-kapt` を記述する必要がある
```
apply plugin: 'kotlin-kapt'
```

## Tips
Project にしたほうが見やすい

## 参考URL
* [Android の gitignore](https://github.com/github/gitignore/blob/master/Android.gitignore)
* [Android Lifecycleコンポーネント](https://developer.android.com/jetpack/androidx/releases/lifecycle?hl=ja#declaring_dependencies)
* [Android Roomコンポーネント](https://developer.android.com/jetpack/androidx/releases/room?hl=ja)