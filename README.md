# Perceptron-Model
Machine Learning Model (Perceptron Model)

## Examples
####1) Simulates OR operation. There are two input units and one output unit. Input patterns are (0, 0), (0, 1), (1, 0), and (1, 1). The output will be either 1 or 0. The given parameters are as follows:
1. Initial weights are given as 0.6 and 0.8.
2. Learning coefficient is 0.3.
3. Threshold value is 2.

####2) simulate AND operation. There are two input units and one output unit. Input patterns are (0, 0), (0, 1), (1, 0), and (1, 1). The output will be either 1 or 0. The given parameters are as follows;

1. Initial weights are given as 0.8 and 0.5.
2. Learning coefficient is 0.6.
3. Threshold value is 2.

## How to solve
###Modify init() with the proper parameters

```java
    new perceptronModel().init("NOR", 0.2, 0.9, 0.5, -2);
    // init(String type, double weight0, double weight1, double coefficient, double threshold)
```

## Licenses
MIT License

Copyright (c) 2016 Rashid A. Aljohani

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
