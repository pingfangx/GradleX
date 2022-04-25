首先我们创建一个 Android 项目，然后添加一个 lib module。
我们看到 app/build.gradle 和 lib/build.gradle 中都有如下依赖
```
dependencies {
    testImplementation 'junit:junit:4.13.2'
}
```
我们需要统一管理版本，演示了以下不同的方式。

可以在不同的分支看到不同的示例。

| 方式                           | 优点                     | 缺点                       | 备注 |
| ------------------------------ | ------------------------ | -------------------------- | ---- |
| 01 ext                         | 简便                     | 增大脚本                   |
| 02 script plugin               | 抽离版本                 | 无法提示，无法共享         |
| 03 buildSrc precompiled plugin | 可通过 id 应用           | 需要应用插件               |
| 04 buildSrc constants          | 可以代码提示             | 仅能提供，无法实现插件逻辑 |
| 05 include build               | 同 buildSrc              | 同 buildSrc                |
| 06 version catalog             | 官方支持，功能全，可分享 | 仅 kts 中有代码提示        |
| 07 binary plugin               | 功能强大，可使配置简化   | 开发较复杂                 |
