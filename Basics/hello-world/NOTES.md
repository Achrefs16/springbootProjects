What annotations used in this lab, and what is the purpose of each?
@RestController
This tells Spring that this class (HelloController) is a REST controller, meaning it can handle HTTP requests and return responses (like JSON or plain text).

@GetMapping
This maps an HTTP GET request to a specific method. For example, @GetMapping("/") means the method will respond when someone accesses the root URL.

@RequestParam
This binds a web request parameter (e.g., ?name=Ashraf) to a method parameter. It can also define a default value if the parameter is missing.