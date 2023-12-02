import javax.persistence.*

@Entity
data class User(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val userId: Long? = null,

        @Column(nullable = false)
        val username: String,

        @Column(nullable = false)
        val password: String,

        @Column(nullable = false)
        val email: String,

        @ManyToMany
        @JoinTable(
                name = "user_followers",
                joinColumns = [JoinColumn(name = "follower_id")],
                inverseJoinColumns = [JoinColumn(name = "following_id")]
        )
        val followers: List<User> = mutableListOf(),

        @ManyToMany(mappedBy = "followers")
        val following: List<User> = mutableListOf(),

        @OneToMany(mappedBy = "owner")
        val capsules: List<Capsule> = mutableListOf()
)
