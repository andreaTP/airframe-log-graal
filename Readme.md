
Requirements:

 - sbt
 - graalvm
 - graalvm native image (install with `gu install native-image`)

Build:

```
sbt graalvm-native-image:packageBin
```

Run:

```
./target/graalvm-native-image/airframe-log-graal
```