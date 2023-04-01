package drawable
//
//import android.graphics.ColorMatrix
//import android.widget.ImageView.ScaleType
//import androidx.compose.foundation.*
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Search
//import androidx.compose.material.icons.filled.Star
//import androidx.compose.material.icons.outlined.Star
//import androidx.compose.material3.*
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Alignment.Companion.CenterHorizontally
//import androidx.compose.ui.Alignment.Companion.CenterVertically
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.geometry.CornerRadius
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.maronworks.myapplication.ui.theme.Purple80
//import com.maronworks.myapplication.ui.theme.RatingStar
//
///*
//THE MATRIX - SCIENCE FICTION
//Terminator genisys - science fiction
//shaw shank redemption - drama
//doctor strange - fiction
//mr. robot - drama | thriller
//land of mine - history | action
//fury - action
// */
//
//@Composable
//fun HomeScreen()
//{
//    Column(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(10.dp)
//            .verticalScroll(rememberScrollState())
//    ) {
//
//        Box(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(start = 5.dp),
//            contentAlignment = Alignment.TopStart
//        )
//        {
//            TopBar()
//        }
//
//        Spacer(modifier = Modifier.padding(10.dp))
//
//        HighlightsMovies()
//
//        Spacer(modifier = Modifier.padding(10.dp))
//
//        MoreMovies()
//    }
//
//}
//
//@Composable
//fun TopBar()
//{
//    Column(modifier = Modifier.fillMaxWidth()) {
//        Text(text = "The Movie", fontSize = 24.sp, fontWeight = FontWeight.Bold)
//        Text(text = "Watch much easier", fontSize = 18.sp)
//    }
//}
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun HighlightsMovies()
//{
//    Row(
//        modifier = Modifier
//            .fillMaxWidth()
//            .horizontalScroll(rememberScrollState())
//    ) {
//
//        ImageForHighLights(
//            title = "Mr. Robot",
//            genre = "Action | Thriller",
//            image = R.drawable.mr_robot,
//            imgDescription = "Mr. Robot picture", 4
//        )
//
//        ImageForHighLights(
//            title = "The Matrix",
//            genre = "Science Fiction",
//            image = R.drawable.the_matrix,
//            imgDescription = "The Matrix picture", 5
//        )
//
//        ImageForHighLights(
//            title = "Fury",
//            genre = "Action",
//            image = R.drawable.fury,
//            imgDescription = "Fury picture", 3
//        )
//    }
//}
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun ImageForHighLights(
//    title: String,
//    genre: String,
//    image: Int,
//    imgDescription: String,
//    rating: Int
//)
//{
//    Card(
//        modifier = Modifier
//            .width(300.dp)
//            .height(260.dp)
//            .padding(end = 10.dp)
//    )
//    {
//        Image(
//            painter = painterResource(id = image),
//            contentDescription = imgDescription,
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(10.dp)
//                .height(180.dp)
//                .align(CenterHorizontally)
//                .clip(RoundedCornerShape(8.dp)),
//            contentScale = ContentScale.Crop
//        )
//
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(start = 10.dp, end = 10.dp, bottom = 10.dp)
//        ) {
//            Column(
//                modifier = Modifier
//                    .width(120.dp)
//                    .weight(1f)
//                    .padding(start = 5.dp, bottom = 5.dp),
//                verticalArrangement = Arrangement.Center
//            ) {
//                Text(text = title, fontSize = 18.sp, fontWeight = FontWeight.Bold)
//                Text(text = genre, fontSize = 14.sp)
//            }
//
//            Row(
//                modifier = Modifier.align(CenterVertically),
//                verticalAlignment = Alignment.CenterVertically,
//                horizontalArrangement = Arrangement.End
//            ) {
//                repeat(rating)
//                {
//                    Icon(
//                        imageVector = Icons.Filled.Star,
//                        contentDescription = "star",
//                        tint = RatingStar
//                    )
//                }
//                repeat(5 - rating)
//                {
//                    Icon(
//                        imageVector = Icons.Outlined.Star,
//                        contentDescription = "star"
//                    )
//
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun MoreMovies()
//{
//    Column(
//        modifier = Modifier
//            .fillMaxWidth()
//    ) {
//        Text(
//            text = "More Movies",
//            fontSize = 22.sp,
//            fontWeight = FontWeight.Bold,
//            modifier = Modifier.padding(start = 5.dp)
//        )
//
//        Spacer(modifier = Modifier.padding(start = 20.dp, bottom = 15.dp))
//        /*
//THE MATRIX - SCIENCE FICTION /
//Terminator genisys - science fiction
//shaw shank redemption - drama
//doctor strange - fiction
//mr. robot - drama | thriller /
//land of mine - history | action
//fury - action /
// */
//
//        MoreMoviesContainer(R.drawable.shaw_shank_redemption, "Shaw Shank Redemption", "Drama", 5)
//        MoreMoviesContainer(R.drawable.terminator_genisys, "Terminator Genisys", "Science Fiction", 4)
//        MoreMoviesContainer(R.drawable.doctor_strange, "Doctor Strange", "Fiction", 3)
//        MoreMoviesContainer(R.drawable.land_of_mine, "Land of Mine", "History | Action", 4)
//
//    }
//}
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun MoreMoviesContainer(image: Int, title: String, genre: String, rating : Int)
//{
//    Card(
//        modifier = Modifier
//            .fillMaxWidth()
//            .height(150.dp)
//    ) {
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(10.dp),
//        ) {
//
//            Card(
//                modifier = Modifier
//                    .height(140.dp)
//                    .width(100.dp)
//            ) {
//                Image(
//                    painter = painterResource(id = image),
//                    contentDescription = "movie 1",
//                    contentScale = ContentScale.Crop,
//                    modifier = Modifier
//                        .padding(5.dp)
//                        .fillMaxSize()
//                        .clip(RoundedCornerShape(8.dp))
//                )
//            }
//
//            Column(
//                modifier = Modifier
//                    .padding(start = 10.dp)
//                    .align(Alignment.CenterVertically)
//            ) {
//                Text(text = title, fontSize = 18.sp, fontWeight = FontWeight.Bold)
//                Spacer(modifier = Modifier.padding(5.dp))
//                Text(text = genre, fontSize = 14.sp)
//                Spacer(modifier = Modifier.padding(5.dp))
//                Row(
//                    modifier = Modifier,
//                    verticalAlignment = Alignment.CenterVertically,
//                    horizontalArrangement = Arrangement.End
//                ) {
//                    repeat(rating)
//                    {
//                        Icon(
//                            imageVector = Icons.Filled.Star,
//                            contentDescription = "star",
//                            tint = RatingStar
//                        )
//                    }
//                    repeat(5 - rating)
//                    {
//                        Icon(
//                            imageVector = Icons.Outlined.Star,
//                            contentDescription = "star"
//                        )
//
//                    }
//                }
//            }
//        }
//    }
//
//    Spacer(modifier = Modifier.padding(5.dp))
//}
