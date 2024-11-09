package com.example.instagramproject.profile

object UserRepository {

    fun getUser(): User {
        return User(
            username = "mafe_1903",
            profileImageUrl = "https://avatar.iran.liara.run/public/91",
            followers = 368,
            following = 365,
            name = "Mafe sánchez",
            description = "Mi gran descripción",
            stories = listOf(
                Story(
                    image = "https://loremflickr.com/cache/resized/65535_53117703609_dcbcf906c7_n_320_240_g.jpg",
                    text = "Paris"
                ),
                Story(
                    image = "https://loremflickr.com/cache/resized/65535_53174334269_ce2ed9d834_320_240_nofilter.jpg",
                    text = "Playa"
                ),
                Story(
                    image = "https://avatar.iran.liara.run/public/job/farmer/female",
                    text = "Trabajo"
                ),
                Story(
                    image = "https://loremflickr.com/cache/resized/65535_53154913438_e7200b56d0_320_240_nofilter.jpg",
                    text = ":)"
                ),
                Story(
                    image = "https://loremflickr.com/cache/resized/65535_52735999455_63c6d612bd_320_240_nofilter.jpg",
                    text = "gato"
                ),
                Story(
                    image = "https://loremflickr.com/cache/resized/65535_53117703609_dcbcf906c7_n_320_240_g.jpg",
                    text = "Recuerdos"
                ),
                Story(
                    image = "https://loremflickr.com/cache/resized/65535_51441326592_d0f11a924e_320_240_nofilter.jpg",
                    text = "<3"
                ),
                Story(
                    image = "https://loremflickr.com/cache/resized/65535_53174334269_ce2ed9d834_320_240_nofilter.jpg",
                    text = "Alegria"
                ),
            ),
            posts = listOf(
                "https://loremflickr.com/cache/resized/65535_53117703609_dcbcf906c7_n_320_240_g.jpg",
                "https://loremflickr.com/cache/resized/65535_53174334269_ce2ed9d834_320_240_nofilter.jpg",
                "https://loremflickr.com/cache/resized/65535_53154913438_e7200b56d0_320_240_nofilter.jpg",
                "https://loremflickr.com/cache/resized/65535_52735999455_63c6d612bd_320_240_nofilter.jpg",
                "https://loremflickr.com/cache/resized/65535_51441326592_d0f11a924e_320_240_nofilter.jpg",
                "https://loremflickr.com/cache/resized/65535_53174334269_ce2ed9d834_320_240_nofilter.jpg",
                "https://loremflickr.com/cache/resized/65535_53117703609_dcbcf906c7_n_320_240_g.jpg",
                "https://loremflickr.com/cache/resized/65535_53174334269_ce2ed9d834_320_240_nofilter.jpg",
                "https://loremflickr.com/cache/resized/65535_53154913438_e7200b56d0_320_240_nofilter.jpg",
                "https://loremflickr.com/cache/resized/65535_52735999455_63c6d612bd_320_240_nofilter.jpg",
                "https://loremflickr.com/cache/resized/65535_51441326592_d0f11a924e_320_240_nofilter.jpg",
                "https://loremflickr.com/cache/resized/65535_53174334269_ce2ed9d834_320_240_nofilter.jpg",
                "https://loremflickr.com/cache/resized/65535_52735999455_63c6d612bd_320_240_nofilter.jpg",
                "https://loremflickr.com/cache/resized/65535_51441326592_d0f11a924e_320_240_nofilter.jpg",
                "https://loremflickr.com/cache/resized/65535_53174334269_ce2ed9d834_320_240_nofilter.jpg"
            )
        )
    }
}