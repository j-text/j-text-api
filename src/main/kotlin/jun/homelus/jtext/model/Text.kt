package jun.homelus.jtext.model

import org.springframework.data.annotation.Id

data class Text(
    val content: String
) {
    @Id
    var id: String? = null
}