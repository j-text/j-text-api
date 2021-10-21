package jun.homelus.jtext.service

import jun.homelus.jtext.model.Text
import jun.homelus.jtext.repository.TextRepository
import org.springframework.stereotype.Service

@Service
class TextService(private val textRepository: TextRepository) {

    fun findText(id: String) = textRepository.findById(id)

    fun findAllText() = textRepository.findAll()

    fun insertText(text: Text) = textRepository.insert(text)
}