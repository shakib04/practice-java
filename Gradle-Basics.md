Create a gradle task to print Hello World

```
task helloWorld {
    doLast {
        println 'Hello World!'
    }
}
```

To run the task, we can use the following command:

```bash
./gradlew helloWorld
```

To get the project name using Gradle, we can use the following command:

```bash
./gradlew -q projects
```
Gradle project names can be configured in the settings.gradle file. To set a project name, we can use the following syntax:

```
rootProject.name = 'gradle-basics'
```

Set some properties in the gradle.properties file,
To set log level to info, we can use the following syntax:

```
org.gradle.logging.level=info
```

Set a custom property with the key-value pair, like we can set version number:

```
version=1.0.0
```

Visualize the gradle with graph

```bash
./gradlew helloWorld --dry-run
```

Get gradle all task list command

```bash
./gradlew task --all
```

# Gradle Essentials

## Build lifecycle phases
There are 03 phases. 
 - Initialization phase
 - Configuration phase
 - Execution phase

Configuration code 
- always outside doFirst and doLast actions
- executed during configuration phase

Execution code
- always inside doFirst and doLast actions
- Executed during execution phase


