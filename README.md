#  BottomZigZagView

## What is this?

View Bottom에 지그재그 모양을 표현함으로써 찢어짐을 표현하거나, 혹은 색다른 표현을 주고 싶을 떄 사용할 수 있습니다. 

## Preview

### Squre

<img src="https://github.com/SSong-develop/BottomZigZagView/blob/master/preview/preview1_square.png" width="300" height="600">

----------



### Curve

<img src="https://github.com/SSong-develop/BottomZigZagView/blob/master/preview/preview2_curve.png" width="300" height="600">

---------



### Linear

<img src="https://github.com/SSong-develop/BottomZigZagView/blob/master/preview/preview3_linear.png" width="300" height="600">

## How To Use

```kotlin
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val typeList = listOf(ZigZagType.SQUARE,ZigZagType.CIRCULAR,ZigZagType.LINEAR)
        val shape = BottomZigZagShape(
            zigZagType = typeList.random(),
            waveCount = 15
        )
        setContent {
            ZigZagShapeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier,
                    color = Color.Transparent
                ) {
                    Card(
                        modifier = Modifier.width(300.dp).height(300.dp),
                        shape = shape
                    ) {

                    }
                }
            }
        }
    }
```



## Comment

배포랑 README는 나중에 적습니다.

귀찮아요.