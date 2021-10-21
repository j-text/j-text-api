package jun.homelus.jtext.controller

import jun.homelus.jtext.model.Text
import jun.homelus.jtext.service.TextService
import org.springframework.web.bind.annotation.*

@RequestMapping("/api/text")
@RestController
class TextController(private val textService: TextService) {
    @GetMapping("/{id}")
    fun getText(@PathVariable id: String) = textService.findText(id)

    @GetMapping("/all")
    fun getAllText() = textService.findAllText()

    @PostMapping
    fun saveText(@RequestBody text: Text) = textService.insertText(text)
}