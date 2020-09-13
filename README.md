# UserInfoView [![](https://jitpack.io/v/graphicstone/UserInfoView.svg)](https://jitpack.io/#graphicstone/UserInfoView)
A UserInfoView for android to easily create a UserViewCard with title, subtitle, tag and image in it. You can easily customize the view through xml attributes that are
present there. Support for changing these attributes through Java/Kotlin code would be provided in the upcoming release. 

<p align="center">
  <img src="https://raw.githubusercontent.com/graphicstone/UserInfoView/master/UserInfoView.png" width="620" height="150" title="UserInfoView" align="middle" hspace="40">
</p>

## Gradle
#### Step 1: Add it in your root build.gradle at the end of repositories:
```
  allprojects {
      repositories {
        ...
        maven { url 'https://jitpack.io' }
      }
    }
```
#### Step 2: Add the dependency
```
  dependencies {
            implementation 'com.github.graphicstone:UserInfoView:version'
    }
```

## Maven
#### Step 1. Add the JitPack repository to your build file
```
  <repositories>
      <repository>
          <id>jitpack.io</id>
          <url>https://jitpack.io</url>
      </repository>
    </repositories>
```
#### Step 2. Add the dependency
```
  <dependency>
        <groupId>com.github.graphicstone</groupId>
        <artifactId>UserInfoView</artifactId>
        <version>Tag</version>
  </dependency>
```

## Usage
```
  <com.nullbyte.userinfoview.UserInfoView
          android:id="@+id/userInfoView"
          android:layout_width="match_parent"
          android:layout_height="wrap_content"
          app:backgroundColor="@color/colorGrey"
          app:cornerRadius="@dimen/dp_8"
          app:image="@drawable/ic_image_black_24dp"
          app:subtitle="next text"
          app:subtitleTextColor="@color/colorWhite"
          app:subtitleTextSize="@dimen/sp_18"
          app:tag="check"
          app:tagTextColor="@color/colorWhite"
          app:tagTextSize="@dimen/sp_10"
          app:title="new text"
          app:titleTextColor="@color/colorWhite"
          app:titleTextSize="@dimen/sp_20" />
```

## Limitations
- User can only customize the view through XML attributes and not through Java/Kotlin code.
- Background color for ImageView and TagView is set to colorAccent and cannot be changed as of now.
- Stroke color for ImageView is set to colorPrimaryDark and cannot be changed as of now.

## License
```
MIT License

Copyright (c) 2020 Harishiv Singh

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
