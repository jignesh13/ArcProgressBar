# ArcProgressBar

This repository contains an Android project that showcases a custom view called "ArcProgressBar". The ArcProgressBar is a visually appealing and interactive view that represents progress within a circular arc, providing a unique and engaging progress visualization.

<image src=https://user-images.githubusercontent.com/20221469/58705533-21327500-83cd-11e9-8818-1fbe1faf6909.gif
 width=225 height=400>

 ## Features

- Customizable start and sweep angles for the arc.
- Smooth animation of the progress changes.
- Support for different colors and gradient fills.
- Customizable stroke width and background color.
- User-friendly UI with intuitive interactions and visual feedback.
- Flexible API for easy integration and customization.
- Integration with other views and layouts to create unique progress indicators.


 
 **for gradient color uncomment below line from RoundProgressBar.java**
 
```java
//        final LinearGradient linearGradient = new LinearGradient(0, 0, 0, (float) (getMeasuredHeight()), Color.parseColor("#0074ed"), Color.parseColor("#db458d"), Shader.TileMode.MIRROR);
//        paint.setShader(linearGradient);
```
### how to use
```xml
  <com.example.arcprogressbar.RoundProgressBar
        android:id="@+id/roundProgressBar"
        android:layout_width="250dp"
        android:layout_height="250dp"
        app:backcolor="#e0e0e0"
        app:endprogresscolor="#0000FF"
        app:endprogressradius="8dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:progress="50"
        app:progresscolor="#0000FF"
        app:strokewidth="5dp">
```

## Getting Started

To use the ArcProgressBar project, follow these steps:

1. Clone or download the repository.
2. Open the project in Android Studio.
3. Build and run the app on an Android device or emulator.
4. Interact with the ArcProgressBar view to explore the customization options and observe the progress updates.

## Usage

- Customize the appearance of the ArcProgressBar by modifying colors, angles, stroke width, and background color to match your design requirements.
- Integrate the ArcProgressBar into your own Android projects to provide visually appealing and interactive progress indicators.
- Update the progress value programmatically or through user interactions to reflect the progress of a specific task or operation.

 
## License
   Copyright 2019 jignesh khunt

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
