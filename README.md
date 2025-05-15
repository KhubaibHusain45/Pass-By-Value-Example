My Java code correctly demonstrates pass-by-value behavior for primitive data types.

Java is always pass-by-value.

For primitive types (int, float, double, char, etc.), the actual value is passed to the method.

Changes to parameters a and b inside add() do not affect the original variables x and y.

x and y are not modified because their values were copied into a and b.

Even if you changed a and b inside add(), x and y would remain unchanged
