# localdate-query-parameter-example

This repository contains example code for [my blog post](https://blog.codecentric.de/en/2017/08/parsing-of-localdate-query-parameters-in-spring-boot/) about `LocalDate` used as query parameters in Spring Boot.
Each commit represents one step towards the idiomatic solution:

- Using `@DateTimeFormat` annotation with mandatory parameters.
- Using `Optional<LocalDate>` for optional parameters.
- Using a `@ControllerAdvice` to register a custom editor. Note that this solution does not work with optional parameters.
- Using a `Formatter<LocalDate>`

## Contribution policy

Contributions via GitHub pull requests are gladly accepted from their original author. Along with any pull requests, please state that the contribution is your original work and that you license the work to the project under the project's open source license. Whether or not you state this explicitly, by submitting any copyrighted material via pull request, email, or other means you agree to license the material under the project's open source license and warrant that you have the legal authority to do so.

## License

This code is open source software licensed under the [Apache 2.0 License](https://www.apache.org/licenses/LICENSE-2.0.html).
