@RestController
class App {
	@RequestMapping("/")
	def home() {
		def header = "<html><body>"
		def footer = "</body></html>"
		def content = "<h1>Hello World!</h1><p>this is the html content."

		header + content + footer
	}
}