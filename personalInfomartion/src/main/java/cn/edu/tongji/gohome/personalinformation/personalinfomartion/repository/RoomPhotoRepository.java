package cn.edu.tongji.gohome.personalinformation.personalinfomartion.repository;

import cn.edu.tongji.gohome.personalinformation.personalinfomartion.model.RoomPhotoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 梁乔 2021/11/29
 **/
public interface RoomPhotoRepository extends JpaRepository<RoomPhotoEntity,Long> {
    RoomPhotoEntity findFirstByStayId(Long stayId);
    List<RoomPhotoEntity> findAllByStayId(Long stayId);
}