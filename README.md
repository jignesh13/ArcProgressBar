# ArcProgressBar
<image src=https://user-images.githubusercontent.com/20221469/58705533-21327500-83cd-11e9-8818-1fbe1faf6909.gif
 width=225 height=400>
 
 
 **for gradient color uncomment below line from RoundProgressBar.java**

 <pre>
//        final LinearGradient linearGradient = new LinearGradient(0, 0, 0, (float) (getMeasuredHeight()), Color.parseColor("#0074ed"), Color.parseColor("#db458d"), Shader.TileMode.MIRROR);
//        paint.setShader(linearGradient);
 </pre>
  <pre>
  &lt;com.example.arcprogressbar.RoundProgressBar
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
        app:strokewidth="5dp"/&gt;
  </pre>
  
## License
MIT License

Copyright (c) 2019 jignesh

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
