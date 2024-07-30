package com.example.book.utils

import com.example.book.data.model.Book

object MockDataUtil {
    fun generateMockBooks( ) : List<Book> {
        val books =
            listOf(
                Book(
                    1,
                    "Tôi thấy hoa vàng trên cỏ xanh",
                    "Author",
                    "Description",
                    "https://www.wilsoncenter.org/sites/default/files/media/images/person/james-person-1.jpg",
                    4.5,
                ),
                Book(
                    2,
                    "mùa hè thật đẹp",
                    "Author",
                    "",
                    "https://www.wilsoncenter.org/sites/default/files/media/images/person/james-person-1.jpg",
                    4.5,
                ),
                Book(
                    3,
                    "Sống để kể lại những anh hùng",
                    "Author",
                    "Description",
                    "https://www.wilsoncenter.org/sites/default/files/media/images/person/james-person-1.jpg",
                    4.5,
                ),
                Book(
                    4,
                    "Title",
                    "Author",
                    "Description",
                    "https://www.wilsoncenter.org/sites/default/files/media/images/person/james-person-1.jpg",
                    4.5,
                ),
                Book(
                    5,
                    "Title",
                    "Author",
                    "Description",
                    "https://www.wilsoncenter.org/sites/default/files/media/images/person/james-person-1.jpg",
                    4.5,
                ),
                Book(
                    6,
                    "Title",
                    "Author",
                    "Description",
                    "https://www.wilsoncenter.org/sites/default/files/media/images/person/james-person-1.jpg",
                    4.5,
                ),
                Book(
                    7,
                    "Title",
                    "Author",
                    "Description",
                    "https://www.wilsoncenter.org/sites/default/files/media/images/person/james-person-1.jpg",
                    4.5,
                ),
                Book(
                    8,
                    "Title",
                    "Author",
                    "Description",
                    "https://www.wilsoncenter.org/sites/default/files/media/images/person/james-person-1.jpg",
                    4.5,
                ),
                Book(
                    9,
                    "Title",
                    "Author",
                    "Description",
                    "https://www.wilsoncenter.org/sites/default/files/media/images/person/james-person-1.jpg",
                    4.5,
                ),
                Book(
                    10,
                    "Title",
                    "Author",
                    "Description",
                    "https://www.wilsoncenter.org/sites/default/files/media/images/person/james-person-1.jpg",
                    4.5,
                ),
            )
        return books
    }
}