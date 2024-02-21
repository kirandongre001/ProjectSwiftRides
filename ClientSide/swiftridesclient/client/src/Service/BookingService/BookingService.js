import axios from 'axios';
let baseUrl="http://http://localhost:3000/U_rides/"
class BookingService{
    // getAllproducts(){
    //    return axios.get(baseUrl+"products")
    // }
    // getById(pid){
    //     return axios.get(baseUrl+"products/"+pid)
    // }
    // addProduct(prod){
    //     return axios.post(baseUrl+"products/"+prod.pid,prod)
    // }
    // updateProduct(prod){
    //     return axios.put(baseUrl+"booking/"+prod.pid,prod)
    // }
    deleteBooking(id){
        return axios.delete(baseUrl+"booking/"+id);
    }
}

export default new BookingService();