package sg.edu.ntu.singastays.services;

import java.util.ArrayList;
import java.util.List;

import sg.edu.ntu.singastays.entities.UserFavourite;

public interface UserFavouriteService {
    ArrayList<UserFavourite> getAllUserFavourites();

    UserFavourite getUserFavouriteById(Long id);

    UserFavourite createUserFavourite(Long memberId, Long categoryId, Long attractionId);

    // UserFavourite updateUserFavourite(Long id, UserFavourite userFavourite);
    void deleteUserFavourite(Long id);
}
