<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="menu.jsp" %>
 <div class="col-lg-7 col-xl-8">
              <div class="card d-flex flex-column mb-5">
                <textarea class="form-control border-200 rounded-bottom-0 border-0 flex-1 fs-0" rows="7" placeholder="Write something..."></textarea>
                <div class="card-footer p-3">
                  <div class="d-flex justify-content-between align-items-center">
                    <button class="btn p-0 me-3"><span class="fa-solid fa-image fs-0"></span></button>
                    <button class="btn p-0 me-3"><span class="fa-solid fa-calendar-alt fs-0"></span></button>
                    <button class="btn p-0 me-3"><span class="fa-solid fa-map-marker-alt fs-0"></span></button>
                    <button class="btn p-0 me-3"><span class="fa-solid fa-tag fs-0"></span></button>
                    <div class="dropdown me-3 d-inline-block flex-1">
                      <button class="btn p-0 dropdown-toggle dropdown-caret-none d-flex align-items-center" type="button" data-bs-toggle="dropdown" aria-expanded="false"> <span class="fa-solid fa-globe-asia fs-0 me-1"></span><span class="me-1 lh-base d-none d-sm-block">public</span><span class="fa-solid fa-caret-down fs--2 text-500"></span></button>
                      <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="#">Public</a></li>
                        <li><a class="dropdown-item" href="#">Private</a></li>
                        <li><a class="dropdown-item" href="#">Draft</a></li>
                      </ul>
                    </div>
                    <div class="d-flex align-items-center">
                      <button class="btn btn-primary btn-sm px-6 px-sm-8">Post</button>
                    </div>
                  </div>
                </div>
              </div>
              <div class="mb-9">
                <div class="mb-5">
                  <div class="card mb-4">
                    <div class="card-body p-3 p-sm-4">
                      <div class="border-bottom mb-3">
                        <div class="d-flex align-items-center mb-3"><a href="../../apps/social/profile.html">
                            <div class="avatar avatar-xl  me-2">
                              <img class="rounded-circle " src="../../assets/img//team/59.webp" alt="" />

                            </div>
                          </a>
                          <div class="flex-1"><a class="fw-bold mb-0 text-black" href="../../apps/social/profile.html">Zingko Kudobum</a>
                            <p class="fs--2 mb-0 text-600 fw-semi-bold">35 mins ago<span class="fa-solid fa-circle text-300" data-fa-transform="shrink-10 down-2"></span>Consett, UK<span class="fa-solid fa-circle text-300" data-fa-transform="shrink-10 down-2"></span><span class="fa-solid fa-earth-americas text-900"></span>
                            </p>
                          </div>
                          <div class="btn-reveal-trigger">
                            <button class="btn btn-sm dropdown-toggle dropdown-caret-none transition-none d-flex btn-reveal" type="button" data-bs-toggle="dropdown" data-boundary="window" aria-haspopup="true" aria-expanded="false" data-bs-reference="parent"><span class="fas fa-ellipsis-h"></span></button>
                            <div class="dropdown-menu dropdown-menu-end py-2"><a class="dropdown-item" href="#!">Edit</a><a class="dropdown-item text-danger" href="#!">Delete</a><a class="dropdown-item" href="#!">Download</a><a class="dropdown-item" href="#!">Report abuse</a></div>
                          </div>
                        </div>
                        <p class="text-800">Some paintings I love</p>
                        <div class="row g-1 mb-5">
                          <div class="col-3"><a href="../../assets/img/gallery/17.png" data-gallery="gallery-posts-0"><img class="rounded h-100 w-100" src="../../assets/img/gallery/17.png" alt="..." /></a></div>
                          <div class="col-3"><a href="../../assets/img/gallery/18.png" data-gallery="gallery-posts-0"><img class="rounded h-100 w-100" src="../../assets/img/gallery/18.png" alt="..." /></a></div>
                          <div class="col-6"><a href="../../assets/img/gallery/19.png" data-gallery="gallery-posts-0"><img class="rounded h-100 w-100" src="../../assets/img/gallery/19.png" alt="..." /></a></div>
                        </div>
                      </div>
                      <div class="d-flex">
                        <button class="btn btn-link p-0 me-3 fs--2 fw-bolder" type="button"><span class="fa-solid fa-heart me-1"></span>345 Likes
                        </button>
                        <button class="btn btn-link text-900 p-0 fs--2 me-3 fw-bolder" type="button"><span class="fa-solid fa-comment me-1"></span>45 Comments
                        </button>
                        <button class="btn btn-link text-900 p-0 fs--2 me-2 fw-bolder" type="button"><span class="fa-solid fa-share me-1"></span>56 shares
                        </button>
                      </div>
                    </div>
                    <div class="bg-100 border-top p-3 p-sm-4">
                      <div class="d-flex align-items-start"><a href="../../apps/social/profile.html">
                          <div class="avatar avatar-m  me-2">
                            <img class="rounded-circle " src="../../assets/img//team/23.webp" alt="" />

                          </div>
                        </a>
                        <div class="flex-1">
                          <div class="d-flex align-items-center"><a class="fw-bold mb-0 text-black" href="../../apps/social/profile.html">Mamur Fechetti</a><span class="text-600 fw-semi-bold fs--2 ms-2">35 mins ago</span></div>
                          <p class="mb-0">How long did it take to create this? It appears that you quickly produced the second one.</p>
                          <button class="btn btn-link p-0 text-900 fw-bolder mb-2" type="button"><span class="fa-solid fa-reply fs--2 me-1"></span><span class="fw-bold fs--2">Reply</span></button>
                          <div class="d-flex align-items-start mb-3"><a href="../../apps/social/profile.html">
                              <div class="avatar avatar-m  me-2">
                                <img class="rounded-circle " src="../../assets/img//team/62.webp" alt="" />

                              </div>
                            </a>
                            <div class="flex-1">
                              <div class="d-flex align-items-center"><a class="fw-bold mb-0 text-black" href="../../apps/social/profile.html">Zingko Kudobum</a><span class="text-600 fw-semi-bold fs--2 ms-2">5 mins ago</span></div>
                              <p class="mb-0">I am so clever that sometimes I don't understand a single word of what I am saying.</p>
                            </div>
                          </div>
                        </div>
                      </div>
                      <div class="d-flex align-items-center"><a href="../../apps/social/profile.html">
                          <div class="avatar avatar-m  me-2">
                            <img class="rounded-circle " src="../../assets/img//team/59.webp" alt="" />

                          </div>
                        </a>
                        <div class="flex-1">
                          <input class="form-control" type="text" placeholder="Add comment" />
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
                </div>
                </div>
                
</body>
</html>