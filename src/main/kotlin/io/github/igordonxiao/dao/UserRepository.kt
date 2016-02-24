package io.github.igordonxiao.dao

import io.github.igordonxiao.model.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import javax.transaction.Transactional

/**
 * Created by Gordon on 2/24/2016.
 */
@Repository
@Transactional
open interface  UserRepository : CrudRepository<User, Long> {
}