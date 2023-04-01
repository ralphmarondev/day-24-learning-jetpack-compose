package com.maronworks.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.maronworks.myapplication.ui.theme.RatingStar

@Composable
fun HomeScreenMovieApp()
{
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .verticalScroll(rememberScrollState())
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 5.dp),
            contentAlignment = Alignment.TopStart
        ) {
            TopBar()
        }

        Spacer(modifier = Modifier.padding(10.dp))
        HighLightsMovies()

        Spacer(modifier = Modifier.padding(top = 20.dp))

        MoreMovies()
    }
}

@Composable
fun TopBar()
{
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            text = "The Movie",
            fontSize = 24.sp, fontWeight = FontWeight.Bold
        )
        Text(
            text = "The Movie",
            fontSize = 18.sp
        )
    }
}

@Composable
fun HighLightsMovies()
{
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .horizontalScroll(rememberScrollState())
    ) {
        HighLightsMoviesContainer(title = "Mr. Robot",
            genre = "Action | Thriller",
            image = R.drawable.mr_robot,
            imageDescription = "Mr. Robot picture",
            rating = 4)

        HighLightsMoviesContainer(title = "The Matrix",
            genre = "Science Fiction",
            image = R.drawable.the_matrix,
            imageDescription = "The Matrix picture",
            rating = 4)

        HighLightsMoviesContainer(title = "Fury",
            genre = "Action",
            image = R.drawable.fury,
            imageDescription = "Fury picture",
            rating = 4)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HighLightsMoviesContainer(
    title: String,
    genre: String,
    image: Int,
    imageDescription: String,
    rating: Int
)
{
    Card(
        modifier = Modifier
            .width(300.dp)
            .height(260.dp)
            .padding(end = 10.dp)
    ) {

        Image(
            painter = painterResource(id = image),
            contentDescription = imageDescription,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .height(180.dp)
                .align(CenterHorizontally)
                .clip(RoundedCornerShape(8.dp)),
            contentScale = ContentScale.Crop
        )

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 10.dp, end = 10.dp, bottom = 10.dp)
        ) {

            Column(modifier = Modifier
                .width(120.dp)
                .weight(1f)
                .padding(start = 5.dp, bottom = 5.dp),
            verticalArrangement = Arrangement.Center) {
                Text(text = title, fontSize = 18.sp, fontWeight = FontWeight.Bold)
                Text(text = genre, fontSize = 14.sp)
            }

            Row(modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End) {
                repeat(rating)
                {
                    Icon(imageVector = Icons.Filled.Star,
                        contentDescription = "star",
                    tint = RatingStar)
                }
                repeat(5 - rating)
                {
                    Icon(imageVector = Icons.Outlined.Star,
                        contentDescription = "star")
                }
            }

        }

    }
}

@Composable
fun MoreMovies()
{
    Column(modifier = Modifier.fillMaxWidth()) {

        Text(text = "More Movies",
        fontSize = 22.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(start = 5.dp))

        Spacer(modifier = Modifier.padding(20.dp))

        MoreMoviesContainer(image = R.drawable.shaw_shank_redemption,
            title = "Shaw Shank Redemption",
            genre = "Drama",
            rating = 5)

        MoreMoviesContainer(image = R.drawable.terminator_genisys,
            title = "Terminator Genisys",
            genre = "Science Fiction",
            rating = 4)

        MoreMoviesContainer(image = R.drawable.doctor_strange,
            title = "Doctor Strange",
            genre = "Fiction",
            rating = 3)

        MoreMoviesContainer(image = R.drawable.land_of_mine,
            title = "Land of Mine",
            genre = "History | Action",
            rating = 4)

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MoreMoviesContainer(
    image : Int,
    title :String,
    genre: String,
    rating: Int
)
{
    Card(modifier = Modifier
        .fillMaxWidth()
        .height(150.dp)) {

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)) {

            Card(modifier = Modifier
                .height(140.dp)
                .width(100.dp)) {

                Image(painter = painterResource(id = image),
                    contentDescription = "movie image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(8.dp)))
            }

            Column(
                modifier = Modifier
                    .padding(start = 10.dp)
                    .align(Alignment.CenterVertically)
            ) {
                Text(text = title,
                fontSize = 18.sp, fontWeight = FontWeight.Bold)

                Spacer(modifier = Modifier.padding(5.dp))

                Text(text = genre,
                fontSize = 14.sp)

                Spacer(modifier = Modifier.padding(5.dp))

                Row(verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End) {

                    repeat(rating)
                    {
                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = "star",
                            tint = RatingStar
                        )
                    }
                    repeat(5 - rating)
                    {
                        Icon(
                            imageVector = Icons.Outlined.Star,
                            contentDescription = "star"
                        )
                    }
                }

            }

        }

    }

    Spacer(modifier = Modifier.padding(5.dp))
}

