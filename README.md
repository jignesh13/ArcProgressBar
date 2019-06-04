# ArcProgressBar
<image src=https://user-images.githubusercontent.com/20221469/58705533-21327500-83cd-11e9-8818-1fbe1faf6909.gif
 width=225 height=400>
 
 
 **for gradient color uncomment below line from RoundProgressBar.java**
 
```java
//        final LinearGradient linearGradient = new LinearGradient(0, 0, 0, (float) (getMeasuredHeight()), Color.parseColor("#0074ed"), Color.parseColor("#db458d"), Shader.TileMode.MIRROR);
//        paint.setShader(linearGradient);
```
***use throw layout file***
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
