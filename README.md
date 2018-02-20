# Perceptron-Model
Machine Learning Model (Perceptron Model)

## Examples
#### 1) Simulates OR operation. There are two input units and one output unit. Input patterns are (0, 0), (0, 1), (1, 0), and (1, 1). The output will be either 1 or 0. The given parameters are as follows:
1. Initial weights are given as 0.6 and 0.8.
2. Learning coefficient is 0.3.
3. Threshold value is 2.

#### 2) simulate AND operation. There are two input units and one output unit. Input patterns are (0, 0), (0, 1), (1, 0), and (1, 1). The output will be either 1 or 0. The given parameters are as follows;

1. Initial weights are given as 0.8 and 0.5.
2. Learning coefficient is 0.6.
3. Threshold value is 2.

## Usage
### Modify init() with the proper parameters

```java
    new perceptronModel().init("NOR", 0.2, 0.9, 0.5, -2);
    // init(String type, double weight0, double weight1, double coefficient, double threshold)
```

## Licenses
MIT License
