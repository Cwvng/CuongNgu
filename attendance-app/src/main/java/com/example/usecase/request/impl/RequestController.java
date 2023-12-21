package usecase.request.impl;

import dto.OfficerDataByDayDTO;
import dto.RequestDTO;
import model.Attendance;
import subsystem.hrsystem.IAttendanceRepository;
import subsystem.hrsystem.IRequestRepository;
import usecase.request.IRequestController;

public class RequestController implements IRequestController {
    private final IAttendanceRepository attendanceRepository;
    private final IRequestRepository requestRepository;

    public RequestController(IAttendanceRepository attendanceRepository, IRequestRepository requestRepository) {
        this.attendanceRepository = attendanceRepository;
        this.requestRepository = requestRepository;
    }

    @Override
    public OfficerDataByDayDTO getOfficerDataByDay(Integer employee_id, String day) {
        Attendance attendance = attendanceRepository.getOfficerDataByIdAndDay(employee_id, day);
        OfficerDataByDayDTO officerDataByDayDTO = new OfficerDataByDayDTO();
        officerDataByDayDTO.setTime_in(attendance.getTime_in());
        officerDataByDayDTO.setTime_out(attendance.getTime_out());
        officerDataByDayDTO.setAttendance_id(attendance.getId());
        return officerDataByDayDTO;
    }

    @Override
    public Long createNewRequest(RequestDTO requestDTO) {
        Long result = requestRepository.createNewRequest(requestDTO);
        return result;
    }


}