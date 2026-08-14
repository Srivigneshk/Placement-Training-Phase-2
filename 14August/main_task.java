import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

abstract class Person {
    private String id;
    private String name;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public abstract void displayDetails();
}

class Patient extends Person {
    private int age;
    private String disease;
    private String bloodGroup;

    public Patient(String id, String name, int age, String disease, String bloodGroup) {
        super(id, name);
        if (age <= 0) {
            throw new InvalidAgeException("Invalid age. Age must be greater than 0.");
        }
        this.age = age;
        this.disease = disease;
        this.bloodGroup = bloodGroup;
    }

    public int getAge() {
        return age;
    }

    public String getDisease() {
        return disease;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    @Override
    public void displayDetails() {
        System.out.println("Patient ID: " + getId() + ", Name: " + getName() + ", Age: " + age
                + ", Disease: " + disease + ", Blood Group: " + bloodGroup);
    }
}

class Doctor extends Person {
    private String specialization;
    private int experience;
    private double fee;

    public Doctor(String id, String name, String specialization, int experience, double fee) {
        super(id, name);
        this.specialization = specialization;
        this.experience = experience;
        this.fee = fee;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public void displayDetails() {
        System.out.println("Doctor ID: " + getId() + ", Name: " + getName() + ", Specialization: " + specialization
                + ", Experience: " + experience + " years, Fee: " + fee);
    }
}

class Department {
    private String deptId;
    private String deptName;

    public Department(String deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public void displayDetails() {
        System.out.println("Department ID: " + deptId + ", Department Name: " + deptName);
    }
}

class Appointment {
    private String appointmentId;
    private Patient patient;
    private Doctor doctor;
    private String date;
    private String time;
    private String status;

    public Appointment(String appointmentId, Patient patient, Doctor doctor, String date, String time, String status) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
        this.status = status;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public String getPatientId() {
        return patient.getId();
    }

    public String getDoctorId() {
        return doctor.getId();
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void displayDetails() {
        System.out.println("Appointment ID: " + appointmentId + ", Patient: " + patient.getName()
                + " (" + patient.getId() + "), Doctor: " + doctor.getName() + " (" + doctor.getId() + ")"
                + ", Date: " + date + ", Time: " + time + ", Status: " + status);
    }
}

class PatientNotFoundException extends Exception {
    public PatientNotFoundException(String message) {
        super(message);
    }
}

class DoctorNotFoundException extends Exception {
    public DoctorNotFoundException(String message) {
        super(message);
    }
}

class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Hospital {
    private ArrayList<Patient> patients = new ArrayList<>();
    private ArrayList<Doctor> doctors = new ArrayList<>();
    private ArrayList<Department> departments = new ArrayList<>();
    private LinkedList<Appointment> appointments = new LinkedList<>();
    private LinkedList<Appointment> appointmentHistory = new LinkedList<>();

    public void addPatient(Scanner sc) {
        try {
            System.out.print("Enter Patient ID: ");
            String id = sc.nextLine();
            System.out.print("Enter Patient Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Patient Age: ");
            int age = Integer.parseInt(sc.nextLine());
            System.out.print("Enter Patient Disease: ");
            String disease = sc.nextLine();
            System.out.print("Enter Patient Blood Group: ");
            String bloodGroup = sc.nextLine();

            Patient patient = new Patient(id, name, age, disease, bloodGroup);
            patients.add(patient);
            System.out.println("Patient added successfully.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric age.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    public void addDoctor(Scanner sc) {
        try {
            System.out.print("Enter Doctor ID: ");
            String id = sc.nextLine();
            System.out.print("Enter Doctor Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Doctor Specialization: ");
            String specialization = sc.nextLine();
            System.out.print("Enter Doctor Experience (years): ");
            int experience = Integer.parseInt(sc.nextLine());
            System.out.print("Enter Doctor Fee: ");
            double fee = Double.parseDouble(sc.nextLine());

            Doctor doctor = new Doctor(id, name, specialization, experience, fee);
            doctors.add(doctor);
            System.out.println("Doctor added successfully.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Experience must be integer and fee must be numeric.");
        }
    }

    public void addDepartment(Scanner sc) {
        System.out.print("Enter Department ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Department Name: ");
        String name = sc.nextLine();

        departments.add(new Department(id, name));
        System.out.println("Department added successfully.");
    }

    public void searchPatient(Scanner sc) {
        System.out.print("Enter Patient ID to search: ");
        String id = sc.nextLine();
        try {
            Patient patient = findPatientById(id);
            patient.displayDetails();
        } catch (PatientNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void searchDoctor(Scanner sc) {
        System.out.print("Enter Doctor ID to search: ");
        String id = sc.nextLine();
        try {
            Doctor doctor = findDoctorById(id);
            doctor.displayDetails();
        } catch (DoctorNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void removePatient(Scanner sc) {
        System.out.print("Enter Patient ID to remove: ");
        String id = sc.nextLine();
        boolean removed = patients.removeIf(p -> p.getId().equalsIgnoreCase(id));
        if (removed) {
            appointments.removeIf(a -> a.getPatientId().equalsIgnoreCase(id));
            System.out.println("Patient removed successfully.");
        } else {
            System.out.println("Patient not found.");
        }
    }

    public void removeDoctor(Scanner sc) {
        System.out.print("Enter Doctor ID to remove: ");
        String id = sc.nextLine();
        boolean removed = doctors.removeIf(d -> d.getId().equalsIgnoreCase(id));
        if (removed) {
            appointments.removeIf(a -> a.getDoctorId().equalsIgnoreCase(id));
            System.out.println("Doctor removed successfully.");
        } else {
            System.out.println("Doctor not found.");
        }
    }

    public void displayPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients available.");
            return;
        }
        for (Patient patient : patients) {
            patient.displayDetails();
        }
    }

    public void displayDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors available.");
            return;
        }
        for (Doctor doctor : doctors) {
            doctor.displayDetails();
        }
    }

    public void displayDepartments() {
        if (departments.isEmpty()) {
            System.out.println("No departments available.");
            return;
        }
        for (Department department : departments) {
            department.displayDetails();
        }
    }

    public void bookAppointment(Scanner sc) {
        try {
            System.out.print("Enter Appointment ID: ");
            String appointmentId = sc.nextLine();
            System.out.print("Enter Patient ID: ");
            String patientId = sc.nextLine();
            System.out.print("Enter Doctor ID: ");
            String doctorId = sc.nextLine();
            System.out.print("Enter Date (YYYY-MM-DD): ");
            String date = sc.nextLine();
            System.out.print("Enter Time (HH:MM): ");
            String time = sc.nextLine();

            Patient patient = findPatientById(patientId);
            Doctor doctor = findDoctorById(doctorId);

            Appointment appointment = new Appointment(appointmentId, patient, doctor, date, time, "BOOKED");
            appointments.add(appointment);
            appointmentHistory.add(appointment);
            System.out.println("Appointment booked successfully.");
        } catch (PatientNotFoundException | DoctorNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void cancelAppointment(Scanner sc) {
        System.out.print("Enter Appointment ID to cancel: ");
        String appointmentId = sc.nextLine();

        Appointment target = null;
        for (Appointment appointment : appointments) {
            if (appointment.getAppointmentId().equalsIgnoreCase(appointmentId)) {
                target = appointment;
                break;
            }
        }

        if (target == null) {
            System.out.println("Appointment not found.");
            return;
        }

        target.setStatus("CANCELLED");
        appointments.remove(target);
        System.out.println("Appointment cancelled successfully.");
    }

    public void displayAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No active appointments available.");
        } else {
            System.out.println("Active Appointments:");
            for (Appointment appointment : appointments) {
                appointment.displayDetails();
            }
        }

        if (appointmentHistory.isEmpty()) {
            System.out.println("No appointment history available.");
        } else {
            System.out.println("Appointment History:");
            for (Appointment appointment : appointmentHistory) {
                appointment.displayDetails();
            }
        }
    }

    public void searchDoctorBySpecialization(Scanner sc) {
        System.out.print("Enter Specialization: ");
        String specialization = sc.nextLine();
        boolean found = false;

        for (Doctor doctor : doctors) {
            if (doctor.getSpecialization().equalsIgnoreCase(specialization)) {
                doctor.displayDetails();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No doctor found with that specialization.");
        }
    }

    private Patient findPatientById(String patientId) throws PatientNotFoundException {
        for (Patient patient : patients) {
            if (patient.getId().equalsIgnoreCase(patientId)) {
                return patient;
            }
        }
        throw new PatientNotFoundException("Patient not found with ID: " + patientId);
    }

    private Doctor findDoctorById(String doctorId) throws DoctorNotFoundException {
        for (Doctor doctor : doctors) {
            if (doctor.getId().equalsIgnoreCase(doctorId)) {
                return doctor;
            }
        }
        throw new DoctorNotFoundException("Doctor not found with ID: " + doctorId);
    }
}

public class main_task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hospital hospital = new Hospital();

        while (true) {
            System.out.println("\nMULTI-SPECIALITY HOSPITAL MANAGEMENT SYSTEM");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Add Department");
            System.out.println("4. Search Patient");
            System.out.println("5. Search Doctor");
            System.out.println("6. Remove Patient");
            System.out.println("7. Remove Doctor");
            System.out.println("8. Display Patients");
            System.out.println("9. Display Doctors");
            System.out.println("10. Display Departments");
            System.out.println("11. Book Appointment");
            System.out.println("12. Cancel Appointment");
            System.out.println("13. Display Appointments");
            System.out.println("14. Search Doctor by Specialization");
            System.out.println("15. Exit");
            System.out.print("Enter choice: ");

            try {
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        hospital.addPatient(sc);
                        break;
                    case 2:
                        hospital.addDoctor(sc);
                        break;
                    case 3:
                        hospital.addDepartment(sc);
                        break;
                    case 4:
                        hospital.searchPatient(sc);
                        break;
                    case 5:
                        hospital.searchDoctor(sc);
                        break;
                    case 6:
                        hospital.removePatient(sc);
                        break;
                    case 7:
                        hospital.removeDoctor(sc);
                        break;
                    case 8:
                        hospital.displayPatients();
                        break;
                    case 9:
                        hospital.displayDoctors();
                        break;
                    case 10:
                        hospital.displayDepartments();
                        break;
                    case 11:
                        hospital.bookAppointment(sc);
                        break;
                    case 12:
                        hospital.cancelAppointment(sc);
                        break;
                    case 13:
                        hospital.displayAppointments();
                        break;
                    case 14:
                        hospital.searchDoctorBySpecialization(sc);
                        break;
                    case 15:
                        System.out.println("Exiting...");
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Invalid input. Enter a valid number.");
            }
        }
    }
}
