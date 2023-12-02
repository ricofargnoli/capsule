import java.time.Instant
import javax.persistence.*

@Entity
data class Capsule(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val capsuleId: Long? = null,

        @ManyToOne
        @JoinColumn(name = "owner_id", nullable = false)
        val owner: User,

        @ManyToMany
        @JoinTable(
                name = "capsule_users",
                joinColumns = [JoinColumn(name = "capsule_id")],
                inverseJoinColumns = [JoinColumn(name = "user_id")]
        )
        val users: List<User> = mutableListOf(),

        @Column(nullable = false)
        val creation: Instant,

        @Column(nullable = false)
        val expiration: Instant,

        @OneToMany(mappedBy = "capsule")
        val photos: List<Photo> = mutableListOf()
)