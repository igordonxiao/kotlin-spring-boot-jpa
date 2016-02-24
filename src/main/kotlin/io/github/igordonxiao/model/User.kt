package io.github.igordonxiao.model

import javax.persistence.*

/**
 * Created by Gordon on 2/24/2016.
 */

@Entity
@Table(name = "user")
data class User(@Id @GeneratedValue(strategy= GenerationType.AUTO) @Column(name = "ID") var id: Long = 0, @Column(name = "name") var name: String = "")