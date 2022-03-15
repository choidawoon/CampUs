package com.ssafy.camping.repository;

import com.ssafy.camping.entity.Camping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CampingRepository extends JpaRepository<Camping, Integer> {

    @Query(value = "SELECT * FROM camping WHERE(thema_envrn_cl REGEXP :thema) order by blog_cnt desc limit 50", nativeQuery = true)
    List<Camping> searchByThema(@Param("thema") String thema);
}