package sulaiman.coderswag.Services

import sulaiman.coderswag.Model.Category
import sulaiman.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "£15", "hat01"),
        Product("Devslopes Hat Black", "£10", "hat02"),
        Product("Devslopes Hat White", "£20", "hat03"),
        Product("Devslopes Hat Snapback", "£18", "hat04")
    )

    val hoodies = listOf(
        Product("Devslopes hoodie Gray", "£30", "hoodie1"),
        Product("Devslopes hoodie Red", "£35", "hoodie2"),
        Product("Devslopes hoodie Bomb", "£20", "hoodie3"),
        Product("Devslopes hoodie Black", "£25", "hoodie4")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "£10", "shirt1"),
        Product("Devslopes Badge Light Gray", "£15", "shirt2"),
        Product("Devslopes Logo Shirt Red", "£20", "shirt3"),
        Product("Devslopes Hustle", "£25", "shirt4"),
        Product("Devslopes Hustle Red", "£25", "shirt5")
        )
}