package ec.edu.sudamericano.practicasys.repository

import ec.edu.sudamericano.practicasys.model.Student
import ec.edu.sudamericano.practicasys.model.Tutor
import org.springframework.data.jpa.repository.JpaRepository

interface TutorRepository: JpaRepository<Tutor, Long?> {
    fun findById(id: Long?): Tutor?
}