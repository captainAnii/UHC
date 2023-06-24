# UHC

This program is designed to count the number of times a URL has been hit without the use of any database. This program uses Maven and Java to create a simple command-line application.

## Prerequisites

- Java Development Kit (JDK) installed on your system
- Maven installed on your system

## Installation

1. Clone the repository or download the source code
2. Open the project in an Integrated Development Environment (IDE) of your choice, such as Eclipse or IntelliJ
3. Build the project using Maven by running the command `mvn clean install` in the root directory of the project

## Usage

1. Run the application by executing the following command in the terminal or command prompt: `java -jar target/URL-Hit-Counter-1.0-SNAPSHOT.jar [URL]`
2. Replace `[URL]` with the URL you want to count hits for
3. The application will output the current number of hits for the specified URL and increment the counter by one
4. Run the application again with the same URL to see the updated hit count

Note: The hit count is stored in memory and will be reset to zero when the application is restarted.

## Contributing

1. Fork the repository
2. Create a new branch for your feature or bug fix
3. Commit your changes and push to your fork
4. Create a pull request to merge your changes into the main repository

## License

This project is licensed under the MIT License. See the LICENSE file for details.
