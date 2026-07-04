# تمرین مدل حافظه - دیاگرام هیپ و استک

## دیاگرام Heap-Stack بعد از اجرای آخرین خط متد main

```mermaid
graph TB
    subgraph Stack["Stack"]
        direction TB
        FrameMain["Frame: main<br>------------------------<br>args → @ArgsArray<br>p1 → @Point1<br>p2 → @Point2<br>t → @Triangle<br>area = 4.5 (double)"]
    end

    subgraph Heap["Heap"]
        direction TB
        
        subgraph Args["@ArgsArray (String[])"]
            direction TB
            A1["[0] → <br>(command line args)"]
        end

        subgraph Point1["@Point1 (Point)"]
            direction TB
            P1x["x = 1 (int)"]
            P1y["y = 4 (int)"]
            O1["Overhead: class pointer, monitor, etc."]
        end

        subgraph Point2["@Point2 (Point)"]
            direction TB
            P2x["x = 4 (int)"]
            P2y["y = 4 (int)"]
            O2["Overhead: class pointer, monitor, etc."]
        end

        subgraph Point3["@Point3 (Point)"]
            direction TB
            P3x["x = 1 (int)"]
            P3y["y = 8 (int)"]
            O3["Overhead: class pointer, monitor, etc."]
        end

        subgraph Triangle["@Triangle (Triangle)"]
            direction TB
            Tp1["p1 → @Point1"]
            Tp2["p2 → @Point2"]
            Tp3["p3 → @Point3"]
            O4["Overhead: class pointer, monitor, etc."]
        end
    end

    FrameMain --> Args
    FrameMain --> Point1
    FrameMain --> Point2
    FrameMain --> Triangle
    Triangle --> Point1
    Triangle --> Point2
    Triangle --> Point3
