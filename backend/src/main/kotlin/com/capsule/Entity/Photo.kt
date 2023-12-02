import java.time.Instant
import javax.persistence.*

@Entity
data class Photo(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val photoId: Long? = null,

        @ManyToOne
        @JoinColumn(name = "user_id", nullable = false)
        val user: User,

        @ManyToOne
        @JoinColumn(name = "capsule_id", nullable = false)
        val capsule: Capsule,

        @Column(nullable = false)
        val creation: Instant
)
