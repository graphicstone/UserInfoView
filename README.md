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
