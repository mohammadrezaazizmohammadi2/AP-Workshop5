# AP Workshop 5 - Debugging Exercise

## Heap & Stack Memory Diagram

```mermaid
graph TB
    subgraph Stack["Stack"]
        direction TB
        Frame3["Frame: multiply<br>num1 = 4<br>num2 = 5"]
        Frame2["Frame: assertResult<br>expected = 20<br>actual = 20<br>testName = 'multiply'"]
        Frame1["Frame: main<br>args = (address of array)"]
        
        Frame3 --> Frame2
        Frame2 --> Frame1
    end

    subgraph Heap["Heap"]
        Arr["String[] args<br>(input array)"]
    end

    Frame1 -.->|reference| Arr
