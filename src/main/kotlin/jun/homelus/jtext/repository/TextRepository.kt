package jun.homelus.jtext.repository

import jun.homelus.jtext.model.Text
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface TextRepository : ReactiveMongoRepository<Text, String>